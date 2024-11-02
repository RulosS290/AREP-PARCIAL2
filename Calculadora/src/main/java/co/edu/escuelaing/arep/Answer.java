package co.edu.escuelaing.arep;

import java.util.List;


public record Answer(String operation, List<Integer> inputlist, int value, int output) { }
