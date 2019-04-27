package com.finalproject.automated.refactoring.tool.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author M. Reza Pahlevi
 * @version 1.0.0
 * @since 27 April 2019
 */

@Data
@Builder
@ToString
@EqualsAndHashCode
public class ClassModel {

    private String packageName;

    @Builder.Default
    private List<String> imports;

    @Builder.Default
    private List<String> keywords = new ArrayList<>();

    private String name;

    private String extend;

    private String implement;

    @Builder.Default
    private List<String> attributes;

    @Builder.Default
    private List<MethodModel> methodModels;

    private String path;

    private String fullContent;

    private Long loc;

    private Long nom;

    private Long nof;
}
