package com.finalproject.automated.refactoring.tool.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author M. Reza Pahlevi
 * @version 1.0.0
 * @since 27 April 2019
 */

@Data
@Builder(builderMethodName = "statementBuilder")
@NoArgsConstructor
@AllArgsConstructor
public class StatementModel {

    private String statement;

    private Integer startIndex;

    private Integer endIndex;
}
