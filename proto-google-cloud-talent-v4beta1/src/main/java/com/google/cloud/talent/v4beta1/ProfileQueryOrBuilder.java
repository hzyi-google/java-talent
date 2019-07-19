// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

public interface ProfileQueryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.ProfileQuery)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Keywords to match any text fields of profiles.
   * For example, "software engineer in Palo Alto".
   * </pre>
   *
   * <code>string query = 1;</code>
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * Optional. Keywords to match any text fields of profiles.
   * For example, "software engineer in Palo Alto".
   * </pre>
   *
   * <code>string query = 1;</code>
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * Optional. The location filter specifies geo-regions containing the profiles
   * to search against.
   * If a location filter isn't specified, profiles fitting the other search
   * criteria are retrieved regardless of where they're located.
   * If
   * [LocationFilter.negated][google.cloud.talent.v4beta1.LocationFilter.negated]
   * is specified, the result doesn't contain profiles from that location.
   * For example, search for profiles with addresses in "New York City".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.LocationFilter location_filters = 2;</code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.LocationFilter> getLocationFiltersList();
  /**
   *
   *
   * <pre>
   * Optional. The location filter specifies geo-regions containing the profiles
   * to search against.
   * If a location filter isn't specified, profiles fitting the other search
   * criteria are retrieved regardless of where they're located.
   * If
   * [LocationFilter.negated][google.cloud.talent.v4beta1.LocationFilter.negated]
   * is specified, the result doesn't contain profiles from that location.
   * For example, search for profiles with addresses in "New York City".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.LocationFilter location_filters = 2;</code>
   */
  com.google.cloud.talent.v4beta1.LocationFilter getLocationFilters(int index);
  /**
   *
   *
   * <pre>
   * Optional. The location filter specifies geo-regions containing the profiles
   * to search against.
   * If a location filter isn't specified, profiles fitting the other search
   * criteria are retrieved regardless of where they're located.
   * If
   * [LocationFilter.negated][google.cloud.talent.v4beta1.LocationFilter.negated]
   * is specified, the result doesn't contain profiles from that location.
   * For example, search for profiles with addresses in "New York City".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.LocationFilter location_filters = 2;</code>
   */
  int getLocationFiltersCount();
  /**
   *
   *
   * <pre>
   * Optional. The location filter specifies geo-regions containing the profiles
   * to search against.
   * If a location filter isn't specified, profiles fitting the other search
   * criteria are retrieved regardless of where they're located.
   * If
   * [LocationFilter.negated][google.cloud.talent.v4beta1.LocationFilter.negated]
   * is specified, the result doesn't contain profiles from that location.
   * For example, search for profiles with addresses in "New York City".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.LocationFilter location_filters = 2;</code>
   */
  java.util.List<? extends com.google.cloud.talent.v4beta1.LocationFilterOrBuilder>
      getLocationFiltersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The location filter specifies geo-regions containing the profiles
   * to search against.
   * If a location filter isn't specified, profiles fitting the other search
   * criteria are retrieved regardless of where they're located.
   * If
   * [LocationFilter.negated][google.cloud.talent.v4beta1.LocationFilter.negated]
   * is specified, the result doesn't contain profiles from that location.
   * For example, search for profiles with addresses in "New York City".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.LocationFilter location_filters = 2;</code>
   */
  com.google.cloud.talent.v4beta1.LocationFilterOrBuilder getLocationFiltersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Job title filter specifies job titles of profiles to match on.
   * If a job title isn't specified, profiles with any titles are retrieved.
   * If multiple values are specified, profiles are retrieved with any of the
   * specified job titles.
   * If
   * [JobTitleFilter.negated][google.cloud.talent.v4beta1.JobTitleFilter.negated]
   * is specified, the result won't contain profiles with the job titles.
   * For example, search for profiles with a job title "Product Manager".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.JobTitleFilter job_title_filters = 3;</code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.JobTitleFilter> getJobTitleFiltersList();
  /**
   *
   *
   * <pre>
   * Optional. Job title filter specifies job titles of profiles to match on.
   * If a job title isn't specified, profiles with any titles are retrieved.
   * If multiple values are specified, profiles are retrieved with any of the
   * specified job titles.
   * If
   * [JobTitleFilter.negated][google.cloud.talent.v4beta1.JobTitleFilter.negated]
   * is specified, the result won't contain profiles with the job titles.
   * For example, search for profiles with a job title "Product Manager".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.JobTitleFilter job_title_filters = 3;</code>
   */
  com.google.cloud.talent.v4beta1.JobTitleFilter getJobTitleFilters(int index);
  /**
   *
   *
   * <pre>
   * Optional. Job title filter specifies job titles of profiles to match on.
   * If a job title isn't specified, profiles with any titles are retrieved.
   * If multiple values are specified, profiles are retrieved with any of the
   * specified job titles.
   * If
   * [JobTitleFilter.negated][google.cloud.talent.v4beta1.JobTitleFilter.negated]
   * is specified, the result won't contain profiles with the job titles.
   * For example, search for profiles with a job title "Product Manager".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.JobTitleFilter job_title_filters = 3;</code>
   */
  int getJobTitleFiltersCount();
  /**
   *
   *
   * <pre>
   * Optional. Job title filter specifies job titles of profiles to match on.
   * If a job title isn't specified, profiles with any titles are retrieved.
   * If multiple values are specified, profiles are retrieved with any of the
   * specified job titles.
   * If
   * [JobTitleFilter.negated][google.cloud.talent.v4beta1.JobTitleFilter.negated]
   * is specified, the result won't contain profiles with the job titles.
   * For example, search for profiles with a job title "Product Manager".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.JobTitleFilter job_title_filters = 3;</code>
   */
  java.util.List<? extends com.google.cloud.talent.v4beta1.JobTitleFilterOrBuilder>
      getJobTitleFiltersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Job title filter specifies job titles of profiles to match on.
   * If a job title isn't specified, profiles with any titles are retrieved.
   * If multiple values are specified, profiles are retrieved with any of the
   * specified job titles.
   * If
   * [JobTitleFilter.negated][google.cloud.talent.v4beta1.JobTitleFilter.negated]
   * is specified, the result won't contain profiles with the job titles.
   * For example, search for profiles with a job title "Product Manager".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.JobTitleFilter job_title_filters = 3;</code>
   */
  com.google.cloud.talent.v4beta1.JobTitleFilterOrBuilder getJobTitleFiltersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Employer filter specifies employers of profiles to match on.
   * If an employer filter isn't specified, profiles with any employers are
   * retrieved.
   * If multiple employer filters are specified, profiles with any matching
   * employers are retrieved.
   * If
   * [EmployerFilter.negated][google.cloud.talent.v4beta1.EmployerFilter.negated]
   * is specified, the result won't contain profiles that match the employers.
   * For example, search for profiles that have working experience at "Google
   * LLC".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.EmployerFilter employer_filters = 4;</code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.EmployerFilter> getEmployerFiltersList();
  /**
   *
   *
   * <pre>
   * Optional. Employer filter specifies employers of profiles to match on.
   * If an employer filter isn't specified, profiles with any employers are
   * retrieved.
   * If multiple employer filters are specified, profiles with any matching
   * employers are retrieved.
   * If
   * [EmployerFilter.negated][google.cloud.talent.v4beta1.EmployerFilter.negated]
   * is specified, the result won't contain profiles that match the employers.
   * For example, search for profiles that have working experience at "Google
   * LLC".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.EmployerFilter employer_filters = 4;</code>
   */
  com.google.cloud.talent.v4beta1.EmployerFilter getEmployerFilters(int index);
  /**
   *
   *
   * <pre>
   * Optional. Employer filter specifies employers of profiles to match on.
   * If an employer filter isn't specified, profiles with any employers are
   * retrieved.
   * If multiple employer filters are specified, profiles with any matching
   * employers are retrieved.
   * If
   * [EmployerFilter.negated][google.cloud.talent.v4beta1.EmployerFilter.negated]
   * is specified, the result won't contain profiles that match the employers.
   * For example, search for profiles that have working experience at "Google
   * LLC".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.EmployerFilter employer_filters = 4;</code>
   */
  int getEmployerFiltersCount();
  /**
   *
   *
   * <pre>
   * Optional. Employer filter specifies employers of profiles to match on.
   * If an employer filter isn't specified, profiles with any employers are
   * retrieved.
   * If multiple employer filters are specified, profiles with any matching
   * employers are retrieved.
   * If
   * [EmployerFilter.negated][google.cloud.talent.v4beta1.EmployerFilter.negated]
   * is specified, the result won't contain profiles that match the employers.
   * For example, search for profiles that have working experience at "Google
   * LLC".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.EmployerFilter employer_filters = 4;</code>
   */
  java.util.List<? extends com.google.cloud.talent.v4beta1.EmployerFilterOrBuilder>
      getEmployerFiltersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Employer filter specifies employers of profiles to match on.
   * If an employer filter isn't specified, profiles with any employers are
   * retrieved.
   * If multiple employer filters are specified, profiles with any matching
   * employers are retrieved.
   * If
   * [EmployerFilter.negated][google.cloud.talent.v4beta1.EmployerFilter.negated]
   * is specified, the result won't contain profiles that match the employers.
   * For example, search for profiles that have working experience at "Google
   * LLC".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.EmployerFilter employer_filters = 4;</code>
   */
  com.google.cloud.talent.v4beta1.EmployerFilterOrBuilder getEmployerFiltersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Education filter specifies education of profiles to match on.
   * If an education filter isn't specified, profiles with any education are
   * retrieved.
   * If multiple education filters are specified, profiles that match any
   * education filters are retrieved.
   * If
   * [EducationFilter.negated][google.cloud.talent.v4beta1.EducationFilter.negated]
   * is specified, the result won't contain profiles that match the educations.
   * For example, search for profiles with a master degree.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.EducationFilter education_filters = 5;</code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.EducationFilter> getEducationFiltersList();
  /**
   *
   *
   * <pre>
   * Optional. Education filter specifies education of profiles to match on.
   * If an education filter isn't specified, profiles with any education are
   * retrieved.
   * If multiple education filters are specified, profiles that match any
   * education filters are retrieved.
   * If
   * [EducationFilter.negated][google.cloud.talent.v4beta1.EducationFilter.negated]
   * is specified, the result won't contain profiles that match the educations.
   * For example, search for profiles with a master degree.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.EducationFilter education_filters = 5;</code>
   */
  com.google.cloud.talent.v4beta1.EducationFilter getEducationFilters(int index);
  /**
   *
   *
   * <pre>
   * Optional. Education filter specifies education of profiles to match on.
   * If an education filter isn't specified, profiles with any education are
   * retrieved.
   * If multiple education filters are specified, profiles that match any
   * education filters are retrieved.
   * If
   * [EducationFilter.negated][google.cloud.talent.v4beta1.EducationFilter.negated]
   * is specified, the result won't contain profiles that match the educations.
   * For example, search for profiles with a master degree.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.EducationFilter education_filters = 5;</code>
   */
  int getEducationFiltersCount();
  /**
   *
   *
   * <pre>
   * Optional. Education filter specifies education of profiles to match on.
   * If an education filter isn't specified, profiles with any education are
   * retrieved.
   * If multiple education filters are specified, profiles that match any
   * education filters are retrieved.
   * If
   * [EducationFilter.negated][google.cloud.talent.v4beta1.EducationFilter.negated]
   * is specified, the result won't contain profiles that match the educations.
   * For example, search for profiles with a master degree.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.EducationFilter education_filters = 5;</code>
   */
  java.util.List<? extends com.google.cloud.talent.v4beta1.EducationFilterOrBuilder>
      getEducationFiltersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Education filter specifies education of profiles to match on.
   * If an education filter isn't specified, profiles with any education are
   * retrieved.
   * If multiple education filters are specified, profiles that match any
   * education filters are retrieved.
   * If
   * [EducationFilter.negated][google.cloud.talent.v4beta1.EducationFilter.negated]
   * is specified, the result won't contain profiles that match the educations.
   * For example, search for profiles with a master degree.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.EducationFilter education_filters = 5;</code>
   */
  com.google.cloud.talent.v4beta1.EducationFilterOrBuilder getEducationFiltersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Skill filter specifies skill of profiles to match on.
   * If a skill filter isn't specified, profiles with any skills are retrieved.
   * If multiple skill filters are specified, profiles that match any skill
   * filters are retrieved.
   * If [SkillFilter.negated][google.cloud.talent.v4beta1.SkillFilter.negated]
   * is specified, the result won't contain profiles that match the skills.
   * For example, search for profiles that have "Java" and "Python" in skill
   * list.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.SkillFilter skill_filters = 6;</code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.SkillFilter> getSkillFiltersList();
  /**
   *
   *
   * <pre>
   * Optional. Skill filter specifies skill of profiles to match on.
   * If a skill filter isn't specified, profiles with any skills are retrieved.
   * If multiple skill filters are specified, profiles that match any skill
   * filters are retrieved.
   * If [SkillFilter.negated][google.cloud.talent.v4beta1.SkillFilter.negated]
   * is specified, the result won't contain profiles that match the skills.
   * For example, search for profiles that have "Java" and "Python" in skill
   * list.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.SkillFilter skill_filters = 6;</code>
   */
  com.google.cloud.talent.v4beta1.SkillFilter getSkillFilters(int index);
  /**
   *
   *
   * <pre>
   * Optional. Skill filter specifies skill of profiles to match on.
   * If a skill filter isn't specified, profiles with any skills are retrieved.
   * If multiple skill filters are specified, profiles that match any skill
   * filters are retrieved.
   * If [SkillFilter.negated][google.cloud.talent.v4beta1.SkillFilter.negated]
   * is specified, the result won't contain profiles that match the skills.
   * For example, search for profiles that have "Java" and "Python" in skill
   * list.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.SkillFilter skill_filters = 6;</code>
   */
  int getSkillFiltersCount();
  /**
   *
   *
   * <pre>
   * Optional. Skill filter specifies skill of profiles to match on.
   * If a skill filter isn't specified, profiles with any skills are retrieved.
   * If multiple skill filters are specified, profiles that match any skill
   * filters are retrieved.
   * If [SkillFilter.negated][google.cloud.talent.v4beta1.SkillFilter.negated]
   * is specified, the result won't contain profiles that match the skills.
   * For example, search for profiles that have "Java" and "Python" in skill
   * list.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.SkillFilter skill_filters = 6;</code>
   */
  java.util.List<? extends com.google.cloud.talent.v4beta1.SkillFilterOrBuilder>
      getSkillFiltersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Skill filter specifies skill of profiles to match on.
   * If a skill filter isn't specified, profiles with any skills are retrieved.
   * If multiple skill filters are specified, profiles that match any skill
   * filters are retrieved.
   * If [SkillFilter.negated][google.cloud.talent.v4beta1.SkillFilter.negated]
   * is specified, the result won't contain profiles that match the skills.
   * For example, search for profiles that have "Java" and "Python" in skill
   * list.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.SkillFilter skill_filters = 6;</code>
   */
  com.google.cloud.talent.v4beta1.SkillFilterOrBuilder getSkillFiltersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Work experience filter specifies the total working experience of
   * profiles to match on.
   * If a work experience filter isn't specified, profiles with any
   * professional experience are retrieved.
   * If multiple work experience filters are specified, profiles that match any
   * work experience filters are retrieved.
   * For example, search for profiles with 10 years of work experience.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.WorkExperienceFilter work_experience_filter = 7;
   * </code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.WorkExperienceFilter>
      getWorkExperienceFilterList();
  /**
   *
   *
   * <pre>
   * Optional. Work experience filter specifies the total working experience of
   * profiles to match on.
   * If a work experience filter isn't specified, profiles with any
   * professional experience are retrieved.
   * If multiple work experience filters are specified, profiles that match any
   * work experience filters are retrieved.
   * For example, search for profiles with 10 years of work experience.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.WorkExperienceFilter work_experience_filter = 7;
   * </code>
   */
  com.google.cloud.talent.v4beta1.WorkExperienceFilter getWorkExperienceFilter(int index);
  /**
   *
   *
   * <pre>
   * Optional. Work experience filter specifies the total working experience of
   * profiles to match on.
   * If a work experience filter isn't specified, profiles with any
   * professional experience are retrieved.
   * If multiple work experience filters are specified, profiles that match any
   * work experience filters are retrieved.
   * For example, search for profiles with 10 years of work experience.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.WorkExperienceFilter work_experience_filter = 7;
   * </code>
   */
  int getWorkExperienceFilterCount();
  /**
   *
   *
   * <pre>
   * Optional. Work experience filter specifies the total working experience of
   * profiles to match on.
   * If a work experience filter isn't specified, profiles with any
   * professional experience are retrieved.
   * If multiple work experience filters are specified, profiles that match any
   * work experience filters are retrieved.
   * For example, search for profiles with 10 years of work experience.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.WorkExperienceFilter work_experience_filter = 7;
   * </code>
   */
  java.util.List<? extends com.google.cloud.talent.v4beta1.WorkExperienceFilterOrBuilder>
      getWorkExperienceFilterOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Work experience filter specifies the total working experience of
   * profiles to match on.
   * If a work experience filter isn't specified, profiles with any
   * professional experience are retrieved.
   * If multiple work experience filters are specified, profiles that match any
   * work experience filters are retrieved.
   * For example, search for profiles with 10 years of work experience.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.WorkExperienceFilter work_experience_filter = 7;
   * </code>
   */
  com.google.cloud.talent.v4beta1.WorkExperienceFilterOrBuilder getWorkExperienceFilterOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. Time filter specifies the create/update timestamp of the profiles
   * to match on.
   * For example, search for profiles created since "2018-1-1".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.TimeFilter time_filters = 8;</code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.TimeFilter> getTimeFiltersList();
  /**
   *
   *
   * <pre>
   * Optional. Time filter specifies the create/update timestamp of the profiles
   * to match on.
   * For example, search for profiles created since "2018-1-1".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.TimeFilter time_filters = 8;</code>
   */
  com.google.cloud.talent.v4beta1.TimeFilter getTimeFilters(int index);
  /**
   *
   *
   * <pre>
   * Optional. Time filter specifies the create/update timestamp of the profiles
   * to match on.
   * For example, search for profiles created since "2018-1-1".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.TimeFilter time_filters = 8;</code>
   */
  int getTimeFiltersCount();
  /**
   *
   *
   * <pre>
   * Optional. Time filter specifies the create/update timestamp of the profiles
   * to match on.
   * For example, search for profiles created since "2018-1-1".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.TimeFilter time_filters = 8;</code>
   */
  java.util.List<? extends com.google.cloud.talent.v4beta1.TimeFilterOrBuilder>
      getTimeFiltersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Time filter specifies the create/update timestamp of the profiles
   * to match on.
   * For example, search for profiles created since "2018-1-1".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.TimeFilter time_filters = 8;</code>
   */
  com.google.cloud.talent.v4beta1.TimeFilterOrBuilder getTimeFiltersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. The hirable filter specifies the profile's hirable status to
   * match on.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue hirable_filter = 9;</code>
   */
  boolean hasHirableFilter();
  /**
   *
   *
   * <pre>
   * Optional. The hirable filter specifies the profile's hirable status to
   * match on.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue hirable_filter = 9;</code>
   */
  com.google.protobuf.BoolValue getHirableFilter();
  /**
   *
   *
   * <pre>
   * Optional. The hirable filter specifies the profile's hirable status to
   * match on.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue hirable_filter = 9;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getHirableFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The application date filters specify application date ranges to
   * match on.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.talent.v4beta1.ApplicationDateFilter application_date_filters = 10;
   * </code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.ApplicationDateFilter>
      getApplicationDateFiltersList();
  /**
   *
   *
   * <pre>
   * Optional. The application date filters specify application date ranges to
   * match on.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.talent.v4beta1.ApplicationDateFilter application_date_filters = 10;
   * </code>
   */
  com.google.cloud.talent.v4beta1.ApplicationDateFilter getApplicationDateFilters(int index);
  /**
   *
   *
   * <pre>
   * Optional. The application date filters specify application date ranges to
   * match on.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.talent.v4beta1.ApplicationDateFilter application_date_filters = 10;
   * </code>
   */
  int getApplicationDateFiltersCount();
  /**
   *
   *
   * <pre>
   * Optional. The application date filters specify application date ranges to
   * match on.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.talent.v4beta1.ApplicationDateFilter application_date_filters = 10;
   * </code>
   */
  java.util.List<? extends com.google.cloud.talent.v4beta1.ApplicationDateFilterOrBuilder>
      getApplicationDateFiltersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The application date filters specify application date ranges to
   * match on.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.talent.v4beta1.ApplicationDateFilter application_date_filters = 10;
   * </code>
   */
  com.google.cloud.talent.v4beta1.ApplicationDateFilterOrBuilder getApplicationDateFiltersOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. The application outcome notes filters specify the notes for the
   * outcome of the job application.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter application_outcome_notes_filters = 11;
   * </code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter>
      getApplicationOutcomeNotesFiltersList();
  /**
   *
   *
   * <pre>
   * Optional. The application outcome notes filters specify the notes for the
   * outcome of the job application.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter application_outcome_notes_filters = 11;
   * </code>
   */
  com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter getApplicationOutcomeNotesFilters(
      int index);
  /**
   *
   *
   * <pre>
   * Optional. The application outcome notes filters specify the notes for the
   * outcome of the job application.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter application_outcome_notes_filters = 11;
   * </code>
   */
  int getApplicationOutcomeNotesFiltersCount();
  /**
   *
   *
   * <pre>
   * Optional. The application outcome notes filters specify the notes for the
   * outcome of the job application.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter application_outcome_notes_filters = 11;
   * </code>
   */
  java.util.List<? extends com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilterOrBuilder>
      getApplicationOutcomeNotesFiltersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The application outcome notes filters specify the notes for the
   * outcome of the job application.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter application_outcome_notes_filters = 11;
   * </code>
   */
  com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilterOrBuilder
      getApplicationOutcomeNotesFiltersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. The application job filters specify the job applied for in the
   * application.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.ApplicationJobFilter application_job_filters = 13;
   * </code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.ApplicationJobFilter>
      getApplicationJobFiltersList();
  /**
   *
   *
   * <pre>
   * Optional. The application job filters specify the job applied for in the
   * application.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.ApplicationJobFilter application_job_filters = 13;
   * </code>
   */
  com.google.cloud.talent.v4beta1.ApplicationJobFilter getApplicationJobFilters(int index);
  /**
   *
   *
   * <pre>
   * Optional. The application job filters specify the job applied for in the
   * application.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.ApplicationJobFilter application_job_filters = 13;
   * </code>
   */
  int getApplicationJobFiltersCount();
  /**
   *
   *
   * <pre>
   * Optional. The application job filters specify the job applied for in the
   * application.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.ApplicationJobFilter application_job_filters = 13;
   * </code>
   */
  java.util.List<? extends com.google.cloud.talent.v4beta1.ApplicationJobFilterOrBuilder>
      getApplicationJobFiltersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The application job filters specify the job applied for in the
   * application.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.ApplicationJobFilter application_job_filters = 13;
   * </code>
   */
  com.google.cloud.talent.v4beta1.ApplicationJobFilterOrBuilder getApplicationJobFiltersOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. This filter specifies a structured syntax to match against the
   * [Profile.custom_attributes][google.cloud.talent.v4beta1.Profile.custom_attributes]
   * that are marked as `filterable`.
   * The syntax for this expression is a subset of Google SQL syntax.
   * String custom attributes: supported operators are =, != where the left of
   * the operator is a custom field key and the right of the operator is a
   * string (surrounded by quotes) value.
   * Numeric custom attributes: Supported operators are '&gt;', '&lt;' or '='
   * operators where the left of the operator is a custom field key and the
   * right of the operator is a numeric value.
   * Supported functions are LOWER(&lt;field_name&gt;) to
   * perform case insensitive match and EMPTY(&lt;field_name&gt;) to filter on the
   * existence of a key.
   * Boolean expressions (AND/OR/NOT) are supported up to 3 levels of
   * nesting (for example "((A AND B AND C) OR NOT D) AND E"), and there can be
   * a maximum of 50 comparisons/functions in the expression. The expression
   * must be &lt; 2000 characters in length.
   * Sample Query:
   * (key1 = "TEST" OR LOWER(key1)="test" OR NOT EMPTY(key1))
   * </pre>
   *
   * <code>string custom_attribute_filter = 15;</code>
   */
  java.lang.String getCustomAttributeFilter();
  /**
   *
   *
   * <pre>
   * Optional. This filter specifies a structured syntax to match against the
   * [Profile.custom_attributes][google.cloud.talent.v4beta1.Profile.custom_attributes]
   * that are marked as `filterable`.
   * The syntax for this expression is a subset of Google SQL syntax.
   * String custom attributes: supported operators are =, != where the left of
   * the operator is a custom field key and the right of the operator is a
   * string (surrounded by quotes) value.
   * Numeric custom attributes: Supported operators are '&gt;', '&lt;' or '='
   * operators where the left of the operator is a custom field key and the
   * right of the operator is a numeric value.
   * Supported functions are LOWER(&lt;field_name&gt;) to
   * perform case insensitive match and EMPTY(&lt;field_name&gt;) to filter on the
   * existence of a key.
   * Boolean expressions (AND/OR/NOT) are supported up to 3 levels of
   * nesting (for example "((A AND B AND C) OR NOT D) AND E"), and there can be
   * a maximum of 50 comparisons/functions in the expression. The expression
   * must be &lt; 2000 characters in length.
   * Sample Query:
   * (key1 = "TEST" OR LOWER(key1)="test" OR NOT EMPTY(key1))
   * </pre>
   *
   * <code>string custom_attribute_filter = 15;</code>
   */
  com.google.protobuf.ByteString getCustomAttributeFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. The candidate availability filter which filters based on
   * availability signals.
   * Signal 1: Number of days since most recent job application.  See
   * [Availability.JobApplicationAvailabilitySignal][google.cloud.talent.v4beta1.Availability.JobApplicationAvailabilitySignal]
   * for the details of this signal.
   * Signal 2: Number of days since last profile update. See
   * [Availability.ProfileUpdateAvailabilitySignal][google.cloud.talent.v4beta1.Availability.ProfileUpdateAvailabilitySignal]
   * for the details of this signal.
   * The candidate availability filter helps a recruiter understand if a
   * specific candidate is likely to be actively seeking new job opportunities
   * based on an aggregated set of signals.  Specifically, the intent is NOT to
   * indicate the candidate's potential qualification / interest / close ability
   * for a specific job.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.CandidateAvailabilityFilter candidate_availability_filter = 16;
   * </code>
   */
  boolean hasCandidateAvailabilityFilter();
  /**
   *
   *
   * <pre>
   * Optional. The candidate availability filter which filters based on
   * availability signals.
   * Signal 1: Number of days since most recent job application.  See
   * [Availability.JobApplicationAvailabilitySignal][google.cloud.talent.v4beta1.Availability.JobApplicationAvailabilitySignal]
   * for the details of this signal.
   * Signal 2: Number of days since last profile update. See
   * [Availability.ProfileUpdateAvailabilitySignal][google.cloud.talent.v4beta1.Availability.ProfileUpdateAvailabilitySignal]
   * for the details of this signal.
   * The candidate availability filter helps a recruiter understand if a
   * specific candidate is likely to be actively seeking new job opportunities
   * based on an aggregated set of signals.  Specifically, the intent is NOT to
   * indicate the candidate's potential qualification / interest / close ability
   * for a specific job.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.CandidateAvailabilityFilter candidate_availability_filter = 16;
   * </code>
   */
  com.google.cloud.talent.v4beta1.CandidateAvailabilityFilter getCandidateAvailabilityFilter();
  /**
   *
   *
   * <pre>
   * Optional. The candidate availability filter which filters based on
   * availability signals.
   * Signal 1: Number of days since most recent job application.  See
   * [Availability.JobApplicationAvailabilitySignal][google.cloud.talent.v4beta1.Availability.JobApplicationAvailabilitySignal]
   * for the details of this signal.
   * Signal 2: Number of days since last profile update. See
   * [Availability.ProfileUpdateAvailabilitySignal][google.cloud.talent.v4beta1.Availability.ProfileUpdateAvailabilitySignal]
   * for the details of this signal.
   * The candidate availability filter helps a recruiter understand if a
   * specific candidate is likely to be actively seeking new job opportunities
   * based on an aggregated set of signals.  Specifically, the intent is NOT to
   * indicate the candidate's potential qualification / interest / close ability
   * for a specific job.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.CandidateAvailabilityFilter candidate_availability_filter = 16;
   * </code>
   */
  com.google.cloud.talent.v4beta1.CandidateAvailabilityFilterOrBuilder
      getCandidateAvailabilityFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Person name filter specifies person name of profiles to match on.
   * If multiple person name filters are specified, profiles that match any
   * person name filters are retrieved.
   * For example, search for profiles of candidates with name "John Smith".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.PersonNameFilter person_name_filters = 17;</code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.PersonNameFilter> getPersonNameFiltersList();
  /**
   *
   *
   * <pre>
   * Optional. Person name filter specifies person name of profiles to match on.
   * If multiple person name filters are specified, profiles that match any
   * person name filters are retrieved.
   * For example, search for profiles of candidates with name "John Smith".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.PersonNameFilter person_name_filters = 17;</code>
   */
  com.google.cloud.talent.v4beta1.PersonNameFilter getPersonNameFilters(int index);
  /**
   *
   *
   * <pre>
   * Optional. Person name filter specifies person name of profiles to match on.
   * If multiple person name filters are specified, profiles that match any
   * person name filters are retrieved.
   * For example, search for profiles of candidates with name "John Smith".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.PersonNameFilter person_name_filters = 17;</code>
   */
  int getPersonNameFiltersCount();
  /**
   *
   *
   * <pre>
   * Optional. Person name filter specifies person name of profiles to match on.
   * If multiple person name filters are specified, profiles that match any
   * person name filters are retrieved.
   * For example, search for profiles of candidates with name "John Smith".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.PersonNameFilter person_name_filters = 17;</code>
   */
  java.util.List<? extends com.google.cloud.talent.v4beta1.PersonNameFilterOrBuilder>
      getPersonNameFiltersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Person name filter specifies person name of profiles to match on.
   * If multiple person name filters are specified, profiles that match any
   * person name filters are retrieved.
   * For example, search for profiles of candidates with name "John Smith".
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.PersonNameFilter person_name_filters = 17;</code>
   */
  com.google.cloud.talent.v4beta1.PersonNameFilterOrBuilder getPersonNameFiltersOrBuilder(
      int index);
}
