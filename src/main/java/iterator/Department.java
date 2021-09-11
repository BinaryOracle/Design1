package iterator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//学院下面的各个系--也是迭代器需要遍历的对象
public class Department
{
    private String name;//名字
    private Integer score;//分数线
}
