/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.designpatternsexamen.sorting;

import java.util.Collections;
import java.util.List;

public class QuickSort implements ISort{
    @Override
    public void doSort(List<String> list) {
        //simulatie van QuickSort
        Collections.sort(list);
        System.out.println("QuickSorted list ");
    }
}
