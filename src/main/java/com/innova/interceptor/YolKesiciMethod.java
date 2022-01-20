package com.innova.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

// interceptor binding oluşturmadığımız için hata verdi. @YolKesiciInterface i
// ekledik
@YolKesiciInterface
@Interceptor
public class YolKesiciMethod {
	
	@AroundInvoke
	public Object aroundInvoke(InvocationContext context) throws Exception {
		// context dediğimiz aslında login sınıfındaki isLogin den gelen bilgilerdir.
		System.out.println("önceki durumum" + context.getMethod().getName() + "" + context.getClass());
		// yol kesici
		// database sorgulama yaptık, session?
		boolean isLogin = true;
		Object isContinue = null;
		
		if (isLogin) {
			System.out.println("öncelikle üye olunuz:");
			return null;
			
		} else {
			
			try {
				isContinue = context.proceed(); // mühürledik artık devam edebilir
				System.out.println("Login olduktan sonra: yönlendirme yapılıyor Admin sayfası");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return isContinue;
	}
	
}
