package com.akitektuo;

/**
 * Created by AoD Akitektuo on 11-Apr-17.
 */
public class Phone {

    private String color;
    private double size;
    private int backCamera;
    private int frontCamera;
    private int internalSpace;
    private int ram;

    public Phone(String color, double size, int backCamera, int frontCamera, int internalSpace, int ram) {
        setColor(color);
        setSize(size);
        setBackCamera(backCamera);
        setFrontCamera(frontCamera);
        setInternalSpace(internalSpace);
        setRam(ram);
    }

    public String toString() {
        return getColor() + " " +
                getSize() + " " +
                getBackCamera() + " " +
                getFrontCamera() + " " +
                getInternalSpace() + " " +
                getRam();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public int getBackCamera() {
        return backCamera;
    }

    public void setBackCamera(int backCamera) {
        this.backCamera = backCamera;
    }

    public int getFrontCamera() {
        return frontCamera;
    }

    public void setFrontCamera(int frontCamera) {
        this.frontCamera = frontCamera;
    }

    public int getInternalSpace() {
        return internalSpace;
    }

    public void setInternalSpace(int internalSpace) {
        this.internalSpace = internalSpace;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
