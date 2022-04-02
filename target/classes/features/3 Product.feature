Feature: Menu Shopping pada shop demoqa
	Scenario: Testing Shopping pada shop demoqa
		When Customer klik menu dashboard shop demoqa
					and Customer memilih product
					and Customer mengisi data diri
					and Customer melakukan checkout 
		Then Customer berhasil membeli product