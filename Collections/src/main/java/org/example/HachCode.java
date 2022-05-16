package org.example;

import java.util.Objects;

public class HachCode {

    private int x;
    private String text;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HachCode hachCode = (HachCode) o;
        return x == hachCode.x && text.equals(hachCode.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, text);
    }

    public static void main(String[] args) {

    }
}
