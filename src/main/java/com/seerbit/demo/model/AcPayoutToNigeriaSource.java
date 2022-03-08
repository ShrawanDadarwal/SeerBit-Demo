package com.seerbit.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AcPayoutToNigeriaSource {
		private String operation;
		
		private AcPayoutToNigeriaSender sender;
		
		private AcPayoutToNigeriaRecipient recipient;
}
