package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.HashMap;

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

  @Test
  void test5() {
    List<String> list_1 = List.of("Red", "Green", "Blue");
    List<Integer> list_2 = List.of(1, 3, 5, 7);
    RuntimeException e = assertThrows(RuntimeException.class, () -> {
      HashMap<String, Integer> map = zipper.hashmapify(list_1, list_2);
    });
    assertEquals("Mismatched list size", e.getMessage());
}

@Test
void test6() {
  List<String> list_1 = List.of("Red", "Green", "Blue");
  List<Integer> list_2 = List.of(1, 3, 5);
  HashMap<String, Integer> map = zipper.hashmapify(list_1, list_2);
  HashMap<String, Integer> expectedMap = new HashMap<>();
  expectedMap.put("Red", 1);
  expectedMap.put("Green", 3);
  expectedMap.put("Blue", 5);
  assertEquals(expectedMap, map);
  }

@Test
void test7() {
  List<String> list_1 = List.of();
  List<Integer> list_2 = List.of();
  HashMap<String, Integer> map = zipper.hashmapify(list_1, list_2);
  HashMap<String, Integer> expectedMap = new HashMap<>();
  assertEquals(expectedMap, map);
  }
}


