package com.Condition;

public class Continue {

	public static void main(String[] args) {
	
        int i = 0;

        while (true) {
            if (i == 5) {
                i++;
                continue;
            }

            System.out.println(i);
            i++;
            break;
        }

	}

}
