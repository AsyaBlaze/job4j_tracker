package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.streams.Input;
import ru.job4j.tracker.streams.StubInput;
import ru.job4j.tracker.streams.StubOutput;
import ru.job4j.tracker.streams.ValidateInput;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenValidInput3Times() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"2", "1", "49"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected2 = input.askInt("Enter menu:");
        int selected1 = input.askInt("Enter menu:");
        int selected49 = input.askInt("Enter menu:");
        assertThat(selected1).isEqualTo(1);
        assertThat(selected2).isEqualTo(2);
        assertThat(selected49).isEqualTo(49);
    }

    @Test
    public void whenInputIsMinus9() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-9"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        String ln = System.lineSeparator();
        assertThat(selected).isEqualTo(-9);
    }
}