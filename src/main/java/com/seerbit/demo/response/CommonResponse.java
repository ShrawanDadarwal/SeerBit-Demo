package com.seerbit.demo.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CommonResponse {
		private String code;
		
		private String message;
		
		private CommonTransaction transaction;

		/**
		 * @return the code
		 */
		public String getCode() {
			return code;
		}

		/**
		 * @param code the code to set
		 */
		public void setCode(String code) {
			this.code = code;
		}

		/**
		 * @return the message
		 */
		public String getMessage() {
			return message;
		}

		/**
		 * @param message the message to set
		 */
		public void setMessage(String message) {
			this.message = message;
		}

		/**
		 * @return the transaction
		 */
		public CommonTransaction getTransaction() {
			return transaction;
		}

		/**
		 * @param transaction the transaction to set
		 */
		public void setTransaction(CommonTransaction transaction) {
			this.transaction = transaction;
		}

		@Override
		public String toString() {
			return "CommonResponse [code=" + code + ", message=" + message + ", transaction=" + transaction + "]";
		}
		
		
}
