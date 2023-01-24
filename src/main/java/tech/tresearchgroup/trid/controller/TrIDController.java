package tech.tresearchgroup.trid.controller;

import tech.tresearchgroup.trid.model.TrIDOptions;

import java.util.ArrayList;
import java.util.List;

public class TrIDController {
    public static List<String> getOptions(TrIDOptions trIDOptions) {
        List<String> optionsList = new ArrayList<>();
        if(trIDOptions.getAe() != null) {
            optionsList.add("-ae");
            optionsList.add(trIDOptions.getAe());
        }
        if(trIDOptions.getCe() != null) {
            optionsList.add("-ce");
            optionsList.add(trIDOptions.getCe());
        }
        if(trIDOptions.getD() != null) {
            optionsList.add("-d:" + trIDOptions.getD());
        }
        if(trIDOptions.getNs() !=  null) {
            optionsList.add("-ns");
            optionsList.add(trIDOptions.getNs());
        }
        if(trIDOptions.getN() != null) {
            optionsList.add("-n:" + trIDOptions.getN());
        }
        if(trIDOptions.isAt()) {
            optionsList.add("-@");
        }
        if(trIDOptions.isV()) {
            optionsList.add("-v");
        }
        if(trIDOptions.isW()) {
            optionsList.add("-w");
        }
        if(trIDOptions.isQuestionMark()) {
            optionsList.add("-?");
        }
        return optionsList;
    }
}
