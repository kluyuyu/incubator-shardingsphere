/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.core.parsing.integrate.jaxb.table;

import lombok.Getter;
import lombok.Setter;
import org.apache.shardingsphere.core.parsing.integrate.jaxb.token.ExpectedColumnDefinition;
import org.apache.shardingsphere.core.parsing.integrate.jaxb.token.ExpectedColumnPosition;
import org.apache.shardingsphere.core.parsing.integrate.jaxb.token.ExpectedUpdateColumnDefinition;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public final class ExpectedAlterTable {
    
    @XmlAttribute(name = "drop-columns")
    private String dropColumns = "";
    
    @XmlAttribute(name = "drop-primary-key")
    private boolean dropPrimaryKey;
    
    @XmlAttribute(name = "new-table-name")
    private String newTableName;
    
    @XmlElementWrapper(name = "add-columns")
    @XmlElement(name = "add-column")
    private List<ExpectedColumnDefinition> addColumns = new ArrayList<>();
    
    @XmlElementWrapper(name = "update-columns")
    @XmlElement(name = "update-column")
    private List<ExpectedUpdateColumnDefinition> updateColumns = new ArrayList<>();
    
    @XmlElementWrapper(name = "position-changed-columns")
    @XmlElement(name = "position-changed-column")
    private List<ExpectedColumnPosition> positionChangedColumns = new ArrayList<>();
}
