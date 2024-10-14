package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ZipperTest {

  Zipper zipper;

  @BeforeEach
  void setUp() {
    zipper = new Zipper();
  }

  @Test
  void test1() {

    List<Integer> nums1 = List.of(1, 3, 5, 7);
    List<Integer> nums2 = List.of(2, 4, 6, 8);
    List<Integer> mergedNumbers = zipper.zip(nums1, nums2);
    List<Integer> ans = List.of(1,2,3,4,5,6,7,8);
    assertEquals(ans, mergedNumbers);
  }
  @Test
  void test2() {
    List<String> colors1 = List.of("Red", "Green", "Blue");
    List<String> colors2 = List.of("White", "Black", "Orange", "Pink");
    List<String> mergedColors = zipper.zip(colors1, colors2);
    List<String> ans = List.of("Red","White","Green","Black","Blue","Orange","Pink");
    assertEquals(ans, mergedColors);
  }
  @Test
  void test3() {
    List<String> colors1 = List.of("Red", "Green", "Blue");
    List<String> colors2 = List.of("White", "Black", "Orange", "Pink");
    List<String> mergedColors = zipper.zip(colors2, colors1);
    List<String> ans = List.of("White","Red","Black","Green","Orange","Blue","Pink");
    assertEquals(ans, mergedColors);  }

  @Test
  void test4() {
    List<String> colors1 = List.of();
    List<String> colors2 = List.of();
    List<String> mergedColors = zipper.zip(colors1, colors2);
    List<String> ans = List.of();
    assertEquals(ans, mergedColors);  }
}

