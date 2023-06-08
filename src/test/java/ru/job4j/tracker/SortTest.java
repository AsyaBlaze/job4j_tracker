package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.sort.ItemAscByName;
import ru.job4j.tracker.sort.ItemDescByName;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

public class SortTest {
    @Test
    public void sortByAsc() {
        List<Item> items = Arrays.asList(
                new Item("Radio"),
                new Item("TV"),
                new Item("Computer")
        );
        List<Item> expected = Arrays.asList(
                new Item("Computer"),
                new Item("Radio"),
                new Item("TV")
        );
        items.sort(new ItemAscByName());
        assertThat(items).isEqualTo(expected);
    }

    @Test
    public void sortByDsc() {
        List<Item> items = Arrays.asList(
                new Item("Radio"),
                new Item("TV"),
                new Item("Computer")
        );
        List<Item> expected = Arrays.asList(
                new Item("TV"),
                new Item("Radio"),
                new Item("Computer")
        );
        items.sort(new ItemDescByName());
        assertThat(items).isEqualTo(expected);
    }
}
