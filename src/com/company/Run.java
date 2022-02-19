package com.company;
import com.company.ACO;
import java.util.Scanner;
public class Run {

        public static void main(String[] args) throws InstantiationException, IllegalAccessException {
               ACO antColony = new ACO(21);
                    antColony.startAntOptimization();
            }

        }


