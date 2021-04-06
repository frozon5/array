package com.epam.training.array;

import java.util.Arrays;

//TODO: write a wrapper class for a java int array, make this class immutable
public class Array {

  final private int[] items = new int[5];
  final private Integer[] array = new Integer[items.length];

  public Array(){
    for (int i = 0; i < 5; i++){
      items[i] = i;
    }
    int i = 0;
    for (int value : items) {
      array[i++] = value;
    }
  }

  public int[] getItems() {
    return items;
  }

  public Integer[] getArray() {
    return array;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Array array1 = (Array) o;
    return Arrays.equals(array, array1.array);
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(array);
  }
}
