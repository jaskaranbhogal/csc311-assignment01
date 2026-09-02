package edu.farmingdale.csc311.fleet;

/**
 * Anything with a horn. Nothing to do in this file.
 * Vehicle implements it in TODO-04.
 */
public interface Honkable {

    String hornSound();

    void honk();

    void honk(int times);
}
