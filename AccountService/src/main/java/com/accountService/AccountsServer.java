package com.accountService;

@EnableAutoConfiguration
@EnableDiscoveryClient
@Import(AccountsWebApplication.class)

public class AccountsServer {
	 @Autowired
	    AccountRepository accountRepository;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("spring.config.name", "accounts-server");

        SpringApplication.run(AccountsServer.class, args);

	}

}
