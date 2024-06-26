package com.esand.restspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UploadFileResponseDto implements Serializable {
	private String fileName;
	private String fileDownloadUri;
	private String fileType;
	private long size;
}