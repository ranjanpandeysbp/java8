package com.company.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFileCaseStudy {

    public static void main(String[] a) throws IOException {

      Stream<String> rowData = Files.lines(Paths.get(System.getProperty("user.dir")+"/"+"salesdata.csv"));
      //System.out.println(rowData);
        //Get only those data which has sales info
        //Cheese,8000,2020 => [Cheese,8000,2020]
        //int totalRows = (int) rowData.map(x->x.split(",")).filter(arr -> arr.length > 2).count();
        //System.out.println(totalRows);

        //get all pizza names which have some sales data
       /*List<String[]> arrayOfSalesRowdata = rowData.map(x->x.split(",")).filter(arr->arr.length>2).collect(Collectors.toList());

       for (String[] arrData :arrayOfSalesRowdata){
           System.out.println("Pizza name: "+arrData[0]+", Sales data: "+arrData[1]);
        }*/

       //Catergorization of sales data for every pizza type
       //{"Cheese":"8000", "Veggie": "7000"}
        /*Map<String, Integer> slaesMap = rowData.map(row -> row.split(","))//[Cheese,8000,2020]
                .filter(r->r.length>2).collect(Collectors.toMap(x->x[0], y->Integer.parseInt(y[1])));
        System.out.println(slaesMap);
        System.out.println("Sales of Margherita: "+slaesMap.get("Margherita"));*/

        //Find the total sales for all pizza for year 2020
        Optional<Integer> optTotalSales = rowData.map(x->x.split(",")).filter(arr -> arr.length > 2)//[Cheese,8000,2020]
                .map(y -> Integer.parseInt(y[1])).reduce((p,q)-> p+q);

        System.out.println("Total sales data for year 2020: "+optTotalSales.get());
    }
}
