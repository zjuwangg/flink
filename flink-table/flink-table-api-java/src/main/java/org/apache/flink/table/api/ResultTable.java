package org.apache.flink.table.api;

import org.apache.flink.types.Row;

/**
 * A ResultTable is the representation of one sql statement execute result.
 */
public interface ResultTable {
	/**
	 *
	 * @return the table schema of ResultTable.
	 */
	TableSchema getResultSchema();

	/**
	 *
	 * @return an iterable Rows to to fetch the table contents.
	 */
	Iterable<Row> getResultRows();
}