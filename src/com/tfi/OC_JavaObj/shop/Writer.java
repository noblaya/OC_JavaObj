package com.tfi.OC_JavaObj.shop;

public interface Writer {

    /**
     * Start writing process
     */
    public void start();

    /**
     * Write on line
     * @param line line
     */
    public void writeLine(String line);

    /**
     * Stop writing process
     */
    public void stop();

}
