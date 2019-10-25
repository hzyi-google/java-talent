/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

public interface WorkExperienceFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.WorkExperienceFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The minimum duration of the work experience (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration min_experience = 1;</code>
   */
  boolean hasMinExperience();
  /**
   *
   *
   * <pre>
   * The minimum duration of the work experience (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration min_experience = 1;</code>
   */
  com.google.protobuf.Duration getMinExperience();
  /**
   *
   *
   * <pre>
   * The minimum duration of the work experience (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration min_experience = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getMinExperienceOrBuilder();

  /**
   *
   *
   * <pre>
   * The maximum duration of the work experience (exclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration max_experience = 2;</code>
   */
  boolean hasMaxExperience();
  /**
   *
   *
   * <pre>
   * The maximum duration of the work experience (exclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration max_experience = 2;</code>
   */
  com.google.protobuf.Duration getMaxExperience();
  /**
   *
   *
   * <pre>
   * The maximum duration of the work experience (exclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration max_experience = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getMaxExperienceOrBuilder();
}
