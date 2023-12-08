package ru.job4j.bank.collection;

import org.junit.jupiter.api.Test;
import ru.job4j.collection.DepDescComp;

import static org.assertj.core.api.Assertions.assertThat;

class DepDescCompTest {
    @Test
    void compare() {
        int rsl = new DepDescComp().compare(
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    void whenUpDepartmentGoBefore() {
        int rsl = new DepDescComp().compare(
                "K2",
                "K2/SK1"
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    void whenFirstDepartmentIsDifferentThenAsc() {
        int rsl = new DepDescComp().compare(
                "K2/SK1/SSK1",
                "K1/SK1/SSK2"
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    void whenFirstDepartmentIsDifferentThenDesc() {
        int rsl = new DepDescComp().compare(
                "K1/SK1/SSK1",
                "K2/SK1"
        );
        assertThat(rsl).isGreaterThan(0);
    }
}