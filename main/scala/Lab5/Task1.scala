package Lab5

import chisel3._
import chisel3.util._

class Task1(width : Int) extends Module {
    require (width >= 0)

    val io = IO(new Bundle {
            val in0 = Input(UInt(width.W))
            val in1 = Input(UInt(width.W))
            val sum = Output(UInt(width.W))
        })

        io.sum := io.in0 + io.in1

}