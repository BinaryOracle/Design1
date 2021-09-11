package construct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//抽象产品
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Computer
{
    String mouse;
    String keyBoard;
    String screen;
}
