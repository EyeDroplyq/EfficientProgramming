package com.carl.guava;

import com.google.common.base.Charsets;
import com.google.common.io.CharSink;
import com.google.common.io.CharSource;
import com.google.common.io.Files;
import com.google.common.primitives.Chars;

import java.io.File;
import java.io.IOException;

/**
 * @description:
 * @author: Carl
 * @createDate: 2024-09-08 17:48
 * @version: 1.0
 */
public class FileTest {
    public static void test() throws IOException {
        CharSource charSource = Files.asCharSource(new File("SourceText.txt"), Charsets.UTF_8);
        CharSink charSink = Files.asCharSink(new File("TargetText.txt"), Charsets.UTF_8);
        charSource.copyTo(charSink);
    }

    public static void main(String[] args) throws IOException {
        test();
    }
}
