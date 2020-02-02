describe('This is my second protractor Test',function() {
	
		it('This function will add two number', function() {
			browser.get("http://juliemr.github.io/protractor-demo/");
			element(by.model("first")).sendKeys("5");
			element(by.model("second")).sendKeys("5");
			element(by.id("gobutton")).click();
			expect(element(by.className("ng-binding")).getText()).toEqual("10");
			
		
		});
	});



