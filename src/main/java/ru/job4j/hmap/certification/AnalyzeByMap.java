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
            double score = 0;
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
            }
            rsl.add(new Label(pupil.name(), score / pupil.subjects().size()));
        }
        return rsl;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        ArrayList<Label> rsl = new ArrayList<>();
        Map<String, Integer> subjectMap = new HashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjectMap.merge(subject.name(), subject.score(), Integer::sum);
            }
        }
        int size = pupils.get(0).subjects().size();
        for (String subjectName : subjectMap.keySet()) {
            rsl.add(new Label(subjectName, subjectMap.get(subjectName) / size));
        }
        return rsl;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> students = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double score = 0;
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
            }
            students.add(new Label(pupil.name(), score));
        }
        students.sort(Comparator.naturalOrder());
        return students.get(students.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> subjects = averageScoreBySubject(pupils);
        String name = subjects.get(0).name();
        double max = subjects.get(0).score();
        for (Label subject : subjects) {
            if (subject.score() > max) {
                max = subject.score();
                name = subject.name();
            }
        }
        Map<String, Integer> subjectMap = new HashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjectMap.merge(subject.name(), subject.score(), Integer::sum);
            }
        }
        return new Label(name, subjectMap.get(name));
    }
}