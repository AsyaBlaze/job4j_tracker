package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 144", 100),
                new Attachment("image 23", 34),
                new Attachment("image 323423", 13)
        );
        Comparator<Attachment> comparator = new Comparator<>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return Integer.compare(o1.getSize(), o2.getSize());
            }
        };
        attachments.sort(comparator);
        System.out.println(attachments);
        Comparator<Attachment> comparator1 = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment name1, Attachment name2) {
                return name1.getName().compareTo(name2.getName());
            }
        };
        attachments.sort(comparator1);
        System.out.println(attachments);
    }
}
