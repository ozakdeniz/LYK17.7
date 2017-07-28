package tr.org.linux.kamp.threadexample;

import javax.xml.stream.events.StartDocument;

public class ThreadExample {
	
	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("0. çalıştı. ");
			}
		}) .start();
			System.out.println("1. çalıştı. ");
			try {
				Thread.sleep(500);//static metod başka bir sınıftan çağırıyosak statictir.
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("2. çalıştı. ");
				}
			}) .start();
			new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("3. çalıştı. ");
				}
		
	}).start();
			new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("4. çalıştı. ");
				}
		
	}).start();//thread le oluşturduğumuz şeye start atamazsak göndermez kullanıcı ekranında
			//nesne gözükmez
			
			new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("5. çalıştı. ");
				}
		
	}).start();

			new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("6. çalıştı. ");
				}
		
	}).start();
	}
}
