package com.bridgelabz;

import java.util.Scanner;

public class ReversePyramid {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number Of Rows : ");
        int n=scanner.nextInt();
        for(int i=0; i<n ; i++)
        {
            int space;
            for(space =0; space <i; space++)
                System.out.print(" ");
            for(int j=i; j<n; j++)
                System.out.print("* ");
            System.out.print("\n");
        }
    }
}

/*Output :

13:36:58: Executing ':ReversePyramid.main()'...

> Task :compileJava
> Task :processResources NO-SOURCE
> Task :classes

> Task :ReversePyramid.main()
Enter Number Of Rows :
7
* * * * * * *
 * * * * * *
  * * * * *
   * * * *
    * * *
     * *
      *

Deprecated Gradle features were used in this build, making it incompatible with Gradle 8.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

See https://docs.gradle.org/7.1/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 5s
2 actionable tasks: 2 executed
13:37:04: Execution finished ':ReversePyramid.main()'.

* */