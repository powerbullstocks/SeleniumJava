var HtmlReporter = require('protractor-beautiful-reporter');
 
exports.config = {
  framework: 'jasmine2',
  seleniumAddress: 'http://localhost:4444/wd/hub',
  specs: ['Day 2/secondTest.js']

   
   onPrepare: function() {
	   // Add a screenshot reporter and store screenshots to `/tmp/screenshots`:
	   jasmine.getEnv().addReporter(new HtmlReporter({
		   baseDirectory: 'tmp/screenshots'
	   }).getJasmine2Reporter());
   }
}

	