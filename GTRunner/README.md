GTRunner Source Code 11/21
===========================
#### Version 1.1.0
------


#### How to use ?
```
1.專案使用Android Studio開啟
2.執行(export Jar)
3.將Jar Import至測試專案
4.在Suite中Import gt.com.gtrunner.Duration
		  gt.com.gtrunner.DurationTestRunner
```

#### Issue 
```
Report
1.Method Name錯誤
  使用DurationTestRunner取得名稱正確
  是因為測試時是呼叫Suite內的Function
 
  ex. 
  public viod PlayMusic(){
  ...
  }
  
  此時JUnitExecutionListener內的testFinished(Description)取得的名稱會是Method的名稱(PlayMusic)。
  當錯誤發生時，使用testFailure(Failure)取得的名稱會是JUnitCore.runclasses()內的測試class中的Method名稱。
  
2.測試結果未合併
  使用@Duration，錯誤發生時會多次紀錄錯誤訊息。
  
  以上問題存在於JUnitExecutionListener(testFailure、testFinished)、JUnitExecutionListener2(Report)
```

#### 新增 Annotation 
```
  @Duration ( s = … ) 
              s 單位為秒(s)
  @Testorder ( order = … )
               Order 後面加入的為數字 (１、２...)
```

#### Suite 基本架構
```Java
  public class StabilityTest {
  @Test
  public void PlayMusic	{
	JUnitCore core = new JUnitCore();
	core.addListener(new JUnitExecutionListener());
	core.run(PlayMusic.class);
    }
  }
```

#### Report

```Java
  adb pull /sdcard/Report.xml c:/Desktop
```

------

## 程式修改說明
```
  所有程式碼均放置於
  \GTRunner\GTrunner\app\src\main\java\gt\com\gtrunner
```

#### Duration.java
```
  Duration 的 Java Annotation。
```

#### Testorder.java
```
  Testorder 的 Java Annotation。
```

#### DurationTestRunner.java
```
  主要是呼叫JUnitExecutionListener、JUnitExecutionListener2、Duration 這三項Function。
```

#### GTRunner.java
```
  主要是呼叫JUnitExecutionListener偵錯。
  目前已棄用。
```

#### GTTestRunner.java
```
  繼承於ParentRunner，主要是修改其偵測 @Test 的方法以符合偵測Random。
```

```Java
adb shell am instrument -w -r -e r=1 / -e class <class_name> com.android.demo.app.tests
```

#### JUnitExecutionListener.java
```
  testFailure、testFinished 兩項實行在此JAVA內，其功能主要為偵測錯誤。
```

#### JUnitExecutionListener2.java
```
  testRunFinished，主要生成報告、整理報告。
```

------

