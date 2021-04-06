package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamps {
    private String stampName;
    private double stampHeight;
    private double stampWidth;
    private String stampSize;
    private boolean stamped;

    public Stamps(String stampName, double stampHeight, double stampWidth, boolean stamped) {
        this.stampName = stampName;
        this.stampHeight = stampHeight;
        this.stampWidth = stampWidth;
        this.stamped = stamped;
    }

    public String getStampName() {
        return stampName;
    }

    public String getStampSize() {
        return stampWidth + " x " + stampHeight;
    }

    public boolean isStamped() {
            return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamps stamps = (Stamps) o;
        return Double.compare(stamps.stampHeight, stampHeight) == 0 && Double.compare(stamps.stampWidth, stampWidth) == 0  && stamped == stamps.stamped && Objects.equals(stampName, stamps.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampHeight, stampWidth, stampSize, stamped);
    }

    @Override
    public String toString() {
        return "Stamps{" +
                "stampName='" + stampName + '\'' +
                ", stampHeight=" + stampHeight +
                ", stampWidth=" + stampWidth +
                ", stampSize='" + stampSize + '\'' +
                ", stamped=" + stamped +
                '}';
    }
}
