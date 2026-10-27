class Main {
    public static void main(String[] args) {
        // ForLoop
        // for (int i = 0; i < 5; i++) {
        //     System.out.println(i);
        // }
        
        // ForEachLoop
        // String[] nama = {"nopal", "ipul", "angel","kevin"};
        // for (String orang : nama) {
        //     System.out.println(orang);
        // }

        // while loop
        // int i = 6;
        // while (i >= 0) {
        //     System.out.println(i);
        //     i--;
        // }

        // piramida looping
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         if (j <= i) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // segitiga sama sisi looping
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > 0; j--) {
                if (j <= i & j > 9 - i ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        // do-while
        // int i = 1;
        // do {
        //     System.out.println("pertemuan " + i + " java");
        //     i++;
        // } while (i < 5);

        // break
        // for (int i = 1; i < 5; i++) {
        //     if (i == 3) {
        //         // break;
        //         continue;
        //     }
        //     System.out.println(i);
        // }
    }
}