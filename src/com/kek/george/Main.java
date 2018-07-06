package com.kek.george;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        //todo: check dir for exist
        //todo: index dir
        //todo: return last index file


        String dirToProcessFilesForPostingAndCreateIndexes = "C://kKko//mipmap-xxhdpi-v4";

        File directory = new File(dirToProcessFilesForPostingAndCreateIndexes);
        File[] fList = directory.listFiles();

        for (File fileToProcess : fList) {
            System.out.println(fileToProcess.getAbsolutePath());
        }

    }
}


