/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.designpatternsexamen.sorting;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      ListSorter studentRecords = new ListSorter();
      studentRecords.add("Samual");
      studentRecords.add("Jimmy");
      studentRecords.add("Sandra");
      studentRecords.add("Vivek");
      studentRecords.add("Anna");
      
      studentRecords.sort();
      
      MergeSort merge = new MergeSort();
      studentRecords.setSort(merge);
      studentRecords.sort();
      
      QuickSort quick = new QuickSort();
      studentRecords.setSort(quick);
      studentRecords.sort();
    }   
}
