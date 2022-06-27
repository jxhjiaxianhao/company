package com.example.test.cn.jiaxianhao;

import com.example.test.cn.impl.Ano;
import lombok.Data;

import java.util.List;

@Data
public class Card<E> {

    private static final  String uu ="eee";
    @Ano(name = {"sss"})
    private Integer id;
    private String number;
    private Double money;
    private List<String> list;

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target) {
                   return new int[]{i,j};
                }
        return new int[]{};
    }

    public static int uu() {
        try {
            int i = 1 / 0;
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public String toString() {
        System.out.println("987sd");
        return "Card{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", money=" + money +
                ", list=" + list +
                '}';
    }

    public <T> T ff(T t){
        return t;
    }
}
