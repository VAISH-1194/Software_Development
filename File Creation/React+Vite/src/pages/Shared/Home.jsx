import GridPattern from '@/components/magicui/animated-grid-pattern'
import React from 'react'
import { cn } from "@/lib/utils";
import { BorderBeam } from '@/components/magicui/border-beam';
const Home = () => {
    return (


        <div className='h-full w-full flex justify-center items-center flex-col'>
            <div className='w-full h-full'>
                <div className="relative flex h-[30rem] w-full items-center justify-center overflow-hidden bg-background p-20 ">
                    <div className="relative h-[15rem] w-[60rem] rounded-xl border flex justify-center items-center px-10">
                        <p className="z-10 whitespace-pre-wrap text-left text-5xl font-medium tracking-tighter text-black dark:text-white w-full">
                            Empowering Enterprises & Universities through tailored Learning & Assessment Solutions
                        </p>
                        <BorderBeam />
                    </div>
                    <GridPattern
                        width={20}
                        height={20}
                        x={-1}
                        y={-1}
                        className={cn(
                            "[mask-image:linear-gradient(to_bottom_right,green,transparent,transparent)] ",
                        )}
                    />
                </div>

            </div>
            <div className="relative flex h-[30rem] w-full items-center justify-center overflow-hidden bg-background p-20 ">
                Hello
            </div>
        </div>
    )
}

export default Home