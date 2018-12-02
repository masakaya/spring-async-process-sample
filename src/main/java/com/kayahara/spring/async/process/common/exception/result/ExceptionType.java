package com.kayahara.spring.async.process.common.exception.result;

public enum ExceptionType {

	/**
	 * 業務エラー
	 */
	BUSINESS_ERROR("error.business.exception"),

	/**
	 * データが存在しない場合のエラー
	 */
	DATA_NOT_FOUND("error.data.not.found.exception");

	/**
	 * メッセージID
	 */
	private String messageId;

	/**
	 * コンストラクタ
	 * @param messageId
	 */
	ExceptionType(String messageId ) {
		this.messageId = messageId;
	}

	/**
	 * メッセージIDを取得する
	 * @return メッセージID
	 */
	String getMessageId() {
		return this.messageId;
	}

}
