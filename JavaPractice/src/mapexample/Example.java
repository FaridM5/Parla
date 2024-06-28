package mapexample;

import java.util.Objects;

public class Example {

    private String color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return Objects.equals(color, example.color);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(color);
    }
}
