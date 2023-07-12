package ru.job4j.collection.compil;

import org.junit.jupiter.api.Test;
import java.util.Comparator;
import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {
    @Test
    public void whenComparatorDescByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDscByName().thenComparing(new JobDscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorAscByName() {
        int rsl = new JobAscByName().compare(
                new Job("Make choice", 2),
                new Job("Buy tickets for the concert", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorAscByPriority() {
        int rsl = new JobAscByPriority().compare(
                new Job("Make choice", 2),
                new Job("Buy tickets for the concert", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorDscByPriority() {
        int rsl = new JobDscByPriority().compare(
                new Job("Make choice", 2),
                new Job("Buy tickets for the concert", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorDscByName() {
        int rsl = new JobDscByName().compare(
                new Job("Do Math", 3),
                new Job("Do Database", 3)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorAscByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorByAscNameAndDescPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobDscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Buy apple", 0),
                new Job("Buy apple", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorByDescNameAndAscPriority() {
        Comparator<Job> cmpNamePriority = new JobDscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Buy apple", 0),
                new Job("Buy apple", 1)
        );
        assertThat(rsl).isLessThan(0);
    }
}