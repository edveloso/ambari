/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.ambari.logsearch.doc;

public class DocConstants {

  public class CommonDescriptions {
    public static final String X_AXIS_D = "The column which can be value for x-axis in graph formation";
    public static final String Y_AXIS_D = "The column which can be value for y-axis in graph formation";
    public static final String STACK_BY_D = "The graph property for stacking the plot";
    public static final String EXCLUDE_QUERY_D = "Exclude the values in query result e.g.: [{message:*timeout*}]";
    public static final String INCLUDE_QUERY_D = "Include the values in query result e.g.: [{message:*exception*}]";
    public static final String MUST_BE_D = "Include the components, comma separated values";
    public static final String MUST_NOT_D = "Exclude the components, comma separated values";
    public static final String FROM_D = "Date range param, start date";
    public static final String TO_D = "Date range param, end date";
    public static final String START_TIME_D = "Date range param which is suportted from browser url";
    public static final String END_TIME_D = "Date range param which is supported from browser url";
    public static final String START_INDEX_D = "Start index of the queried result";
    public static final String SORT_TYPE_D = "Type of sorting (osc, desc)";
    public static final String SORT_BY_D = "Sorting the results based on this field";
    public static final String PAGE_D = "Number of pages for the results";
    public static final String PAGE_SIZE_D = "Page size of the results";
    public static final String UNIT_D = "Aggregate the data with time gap as unit i.e 1MINUTE";
    public static final String QUERY_D = "not required";
    public static final String I_MESSAGE_D = "Include query which will query against message column";
    public static final String E_MESSAGE_D = "Exclude query which will query against message column";
    public static final String IS_LAST_PAGE_D = "Show last page (true/false)";
    public static final String FIELD_D = "Get values for particular field";
    public static final String FORMAT_D = "File Export format, can be 'txt' or 'json'";
    public static final String TOP = "Number that defines how many top element you would like to see.";
  }

  public class AuditOperationDescriptions {
    public static final String GET_AUDIT_SCHEMA_FIELD_LIST_OD = "Get list of schema fields in audit collection";
    public static final String GET_AUDIT_LOGS_OD = "Get the list of logs details";
    public static final String GET_AUDIT_COMPONENTS_OD = "Get the list of audit components currently active or having data in Solr";
    public static final String GET_AUDIT_LINE_GRAPH_DATA_OD = "Get the data required for line graph";
    public static final String GET_TOP_AUDIT_RESOURCES_OD = "Get the top audit resource count (grouped by type)";
    public static final String EXPORT_USER_TALBE_TO_TEXT_FILE_OD = "Export the tables shown on Audit tab";
    public static final String GET_SERVICE_LOAD_OD = "The graph for showing the top users accessing the services";
  }

  public class ServiceDescriptions {
    public static final String LEVEL_D = "filter for log level";
    public static final String BUNDLE_ID = "filter for host";
    public static final String FILE_NAME_D = "File name filter which is supported from browser url";
    public static final String HOST_NAME_D = "Host name filter which is supported from browser url";
    public static final String COMPONENT_NAME_D = "Component name filter which is supported from browser url";
    public static final String FIND_D = "Finding particular text on subsequent pages in case of table view with pagination";
    public static final String ID_D = "Log id value for traversing to that particular record with that log id";
    public static final String KEYWORD_TYPE_D = "Serching the find param value in previous or next in paginated table";
    public static final String TOKEN_D = "unique number used along with FIND_D. The request can be canceled using this token";
    public static final String SOURCE_LOG_ID_D = "fetch the record set having that log Id";
    public static final String NUMBER_ROWS_D = "Getting rows after particular log entry - used in 'Preview' option";
    public static final String SCROLL_TYPE_D = "Used in 'Preview' feature for getting records 'after' or 'before'";
    public static final String UTC_OFFSET_D = "timezone offset";
    public static final String HOST_PARAMS_D = "filter for hosts";
  }

  public class ServiceOperationDescriptions {
    public static final String SEARCH_LOGS_OD = "Searching logs entry";
    public static final String GET_HOSTS_OD = "Get the list of service hosts currently active or having data in Solr";
    public static final String GET_COMPONENTS_OD = "Get the list of service components currently active or having data in Solr";
    public static final String GET_AGGREGATED_INFO_OD = "not required";
    public static final String GET_LOG_LEVELS_COUNT_OD = "Get Log levels with their counts";
    public static final String GET_COMPONENTS_COUNT_OD = "Get components with their counts";
    public static final String GET_HOSTS_COUNT_OD = "Get hosts with their counts";
    public static final String GET_TREE_EXTENSION_OD = "Get host and compoenets hierarchy with log counts";
    public static final String GET_HISTOGRAM_DATA_OD = "Get data for histogram";
    public static final String EXPORT_TO_TEXT_FILE_OD = "Export the table data in file";
    public static final String GET_COMPONENT_LIST_WITH_LEVEL_COUNT_OD = "Get components with log level distribution count";
    public static final String GET_ANY_GRAPH_COUNT_DATA_OD = "Get the data generic enough to use for graph plots (yAzis is always count)";
    public static final String GET_HOST_LIST_BY_COMPONENT_OD = "Get host list of components";
    public static final String GET_SERVICE_LOGS_SCHEMA_FIELD_NAME_OD = "Get service logs schema fields";
    public static final String GET_HADOOP_SERVICE_CONFIG_JSON_OD = "Get the json having meta data of services supported by logsearch";
    public static final String GET_AFTER_BEFORE_LOGS_OD = "Preview feature data";
    public static final String REQUEST_CANCEL = "Cancel an ongoing solr request";
    public static final String GET_HOST_LOGFILES_OD = "Get the log files of the components of a host";
  }

  public class PublicOperationDescriptions {
    public static final String OBTAIN_GENERAL_CONFIG_OD = "Obtain general config";
  }

  public class UserConfigDescriptions {
    public static final String USER_ID_D = "Get config for a particular user id";
    public static final String FILTER_NAME_D = "The saved query as filter in Solr, search is sopprted by this param";
    public static final String ROW_TYPE_D = "Row type is solr to identify as filter query";
  }

  public class UserConfigOperationDescriptions {
    public static final String SAVE_USER_CONFIG_OD = "Save user config";
    public static final String UPDATE_USER_CONFIG_OD = "Update user config";
    public static final String DELETE_USER_CONFIG_OD = "Delete user config";
    public static final String GET_USER_CONFIG_OD = "Get user config";
    public static final String GET_USER_FILTER_OD = "Get user filter";
    public static final String UPDATE_USER_FILTER_OD = "Update user filter";
    public static final String GET_USER_FILTER_BY_ID_OD = "Get user filter by id";
    public static final String GET_ALL_USER_NAMES_OD = "Get all user names";
  }
}
