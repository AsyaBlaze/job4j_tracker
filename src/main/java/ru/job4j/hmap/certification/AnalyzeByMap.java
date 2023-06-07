package ru.job4j.hmap.certification;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double score = 0;
        int countScores = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
                countScores++;
            }
        }
        return score / countScores;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        ArrayList<Label> rsl = new ArrayList<>();
        for (Pupil pupil : pupils) {
            rsl.add(new Label(pupil.name(), countScoreByPupil(pupil) / pupil.subjects().size()));
        }
        return rsl;
    }

    public static double countScoreByPupil(Pupil pupil) {
        double score = 0;
        for (Subject subject : pupil.subjects()) {
            score += subject.score();
        }
        return score;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        ArrayList<Label> rsl = new ArrayList<>();
        Map<String, Integer> subjectMap = countScoreBySubject(pupils);
        int size = pupils.get(0).subjects().size();
        for (String subjectName : subjectMap.keySet()) {
            rsl.add(new Label(subjectName, subjectMap.get(subjectName) / size));
        }
        return rsl;
    }

    public static Map<String, Integer> countScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> subjectMap = new HashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                String subjName = subject.name();
                if (subjectMap.containsKey(subject.name())) {
                    subjectMap.replace(subject.name(), subjectMap.get(subject.name()) + subject.score());
                } else {
                    subjectMap.put(subjName, subject.score());
                }
            }
        }
        return subjectMap;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> students = averageScoreByPupil(pupils);
        String name = students.stream().max((label1, label2) -> (int) (label1.score() - label2.score())).get().name();
        Pupil pupil = null;
        for (Pupil pup : pupils) {
            if (pup.name().equals(name)) {
                pupil = pup;
                break;
            }
        }
        return new Label(name, countScoreByPupil(pupil));
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> subjects = averageScoreBySubject(pupils);
        String name = subjects.stream().max((label1, label2) -> (int) (label1.score() - label2.score())).get().name();

        return new Label(name, countScoreBySubject(pupils).get(name));
    }
}