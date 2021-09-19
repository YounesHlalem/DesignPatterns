/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.designpatternsexamen.sorting;

import java.util.ArrayList;
import java.util.List;

public class ListSorter {
    private List<String> _list = new ArrayList<String>();
    ISort selectedSort;

    public ListSorter() {
        selectedSort = new InsertionSort();
    }
    
    public void setSort(ISort sort){
        selectedSort = sort;
    }
    
    public void add(String name)
    {
      _list.add(name);
    }

    public void sort()
    {
        selectedSort.doSort(_list);
        
      for (String name : _list)
      {
          System.out.println(" "+name);
      }
    }       
}
