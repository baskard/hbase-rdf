/*
 * Copyright © 2010, 2011, 2012 Talis Systems Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.talis.hbase.rdf.layout.hash;

import com.talis.hbase.rdf.store.TableDesc;

public class TableDescNodes extends TableDesc
{
	protected static final String TBL_NAME = "-nodes" ;
    
	protected static final String COL_FAMILY_NAME_STR 		= "nodes";

	protected static final String CELL_VALUE_SEPARATOR 		= "&&";
	protected static final String TRIPLE_SEPARATOR 			= "~~";

	private final String _COL_FAMILY_NAME_STR ;

    public static String name() { return TBL_NAME ; }

	public TableDescNodes() { this( TBL_NAME, COL_FAMILY_NAME_STR ) ; }
	
	public TableDescNodes( String tableName, String colFamily )
	{
		super( tableName, colFamily ) ;
		_COL_FAMILY_NAME_STR = colFamily ;
	}
	
	public String getColFamilyName() { return _COL_FAMILY_NAME_STR ; }
}
