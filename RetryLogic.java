package retry_mechanism;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer
{
	int count = 0;
	int retry_count= 3;
	@Override
	public boolean retry(ITestResult result)
	{
		if(count<retry_count)
		{
			count++;
			return true;
		}

		return false;
	}

	
	
	
}
