package com.kayahara.spring.async.process.sample.entity;

import com.kayahara.spring.async.process.sample.constants.UploadStatus;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.OffsetDateTime;

@Data
@Entity
@Table(name = "upload_file_job_manager")
@EntityListeners(AuditingEntityListener.class)
public class UploadFileJobManager implements Serializable {
  private static final long serialVersionUID = -4971292903388444069L;
  @Id
  @GeneratedValue
  @Column(name = "job_id")
  private Integer jobId;

  @Column(name = "file_name", nullable = false)
  private String fileName;

  @Column(name = "status", nullable = false)
  private UploadStatus status;

  @Column(name = "create_user", nullable = false)
  private String createUser;

  @CreatedDate
  @Column(name = "create_datetime", nullable = false)
  private OffsetDateTime createDateTime;

  @Column(name = "update_user", nullable = false)
  private String updateUser;

  @Column(name = "update_datetime", nullable = false)
  @LastModifiedDate
  private OffsetDateTime updateDateTime;
}
