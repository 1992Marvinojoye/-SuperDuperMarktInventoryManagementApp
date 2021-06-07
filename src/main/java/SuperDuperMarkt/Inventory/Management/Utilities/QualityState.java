package SuperDuperMarkt.Inventory.Management.Utilities;

import java.util.HashMap;
import java.util.Map;

public enum QualityState {
	
	High("High",3),
	Medium("Medium",2),
	Low("Low",1),
	Spoiled("Spoiled",0),
	DEV("High",3);
	
	private String quality;
	private Integer rate;
	
	QualityState(String quality,Integer rate) {
        this.quality = quality;
        this.rate = rate;
    }
 
    public String getQuality() {
        return quality;
    }
    
    public Integer getRate() {
        return rate;
    }
}


/** Usage Lambda
 * https://howtodoinjava.com/java/enum/java-enum-string-example/
 * 
public static Environment get(String url) {
	return Arrays.stream(values())
	.filter(env -> env.url().equals(url))
	.findFirst()
	.orElse(<some default value>)
	// .orElseThrow(() -> new IllegalArgumentException("Invalid spConnectionId: " + url);  --- or go thru exception
}
 */