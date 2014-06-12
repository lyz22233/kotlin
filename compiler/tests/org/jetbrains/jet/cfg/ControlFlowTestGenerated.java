/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.cfg;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.cfg.AbstractControlFlowTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/cfg")
@InnerTestClasses({ControlFlowTestGenerated.Arrays.class, ControlFlowTestGenerated.Basic.class, ControlFlowTestGenerated.Bugs.class, ControlFlowTestGenerated.ControlStructures.class, ControlFlowTestGenerated.Conventions.class, ControlFlowTestGenerated.DeadCode.class, ControlFlowTestGenerated.Declarations.class, ControlFlowTestGenerated.Expressions.class, ControlFlowTestGenerated.Functions.class, ControlFlowTestGenerated.TailCalls.class})
public class ControlFlowTestGenerated extends AbstractControlFlowTest {
    public void testAllFilesPresentInCfg() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/cfg"), Pattern.compile("^(.+)\\.kt$"), true);
    }
    
    @TestMetadata("compiler/testData/cfg/arrays")
    public static class Arrays extends AbstractControlFlowTest {
        public void testAllFilesPresentInArrays() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/cfg/arrays"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("ArrayAccess.kt")
        public void testArrayAccess() throws Exception {
            doTest("compiler/testData/cfg/arrays/ArrayAccess.kt");
        }
        
        @TestMetadata("arrayAccessExpression.kt")
        public void testArrayAccessExpression() throws Exception {
            doTest("compiler/testData/cfg/arrays/arrayAccessExpression.kt");
        }
        
        @TestMetadata("arrayInc.kt")
        public void testArrayInc() throws Exception {
            doTest("compiler/testData/cfg/arrays/arrayInc.kt");
        }
        
        @TestMetadata("ArrayOfFunctions.kt")
        public void testArrayOfFunctions() throws Exception {
            doTest("compiler/testData/cfg/arrays/ArrayOfFunctions.kt");
        }
        
        @TestMetadata("arraySet.kt")
        public void testArraySet() throws Exception {
            doTest("compiler/testData/cfg/arrays/arraySet.kt");
        }
        
        @TestMetadata("arraySetPlusAssign.kt")
        public void testArraySetPlusAssign() throws Exception {
            doTest("compiler/testData/cfg/arrays/arraySetPlusAssign.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/cfg/basic")
    public static class Basic extends AbstractControlFlowTest {
        public void testAllFilesPresentInBasic() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/cfg/basic"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("Basic.kt")
        public void testBasic() throws Exception {
            doTest("compiler/testData/cfg/basic/Basic.kt");
        }
        
        @TestMetadata("EmptyFunction.kt")
        public void testEmptyFunction() throws Exception {
            doTest("compiler/testData/cfg/basic/EmptyFunction.kt");
        }
        
        @TestMetadata("ShortFunction.kt")
        public void testShortFunction() throws Exception {
            doTest("compiler/testData/cfg/basic/ShortFunction.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/cfg/bugs")
    public static class Bugs extends AbstractControlFlowTest {
        public void testAllFilesPresentInBugs() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/cfg/bugs"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("jumpToOuterScope.kt")
        public void testJumpToOuterScope() throws Exception {
            doTest("compiler/testData/cfg/bugs/jumpToOuterScope.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/cfg/controlStructures")
    public static class ControlStructures extends AbstractControlFlowTest {
        public void testAllFilesPresentInControlStructures() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/cfg/controlStructures"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("Finally.kt")
        public void testFinally() throws Exception {
            doTest("compiler/testData/cfg/controlStructures/Finally.kt");
        }
        
        @TestMetadata("FinallyTestCopy.kt")
        public void testFinallyTestCopy() throws Exception {
            doTest("compiler/testData/cfg/controlStructures/FinallyTestCopy.kt");
        }
        
        @TestMetadata("For.kt")
        public void testFor() throws Exception {
            doTest("compiler/testData/cfg/controlStructures/For.kt");
        }
        
        @TestMetadata("If.kt")
        public void testIf() throws Exception {
            doTest("compiler/testData/cfg/controlStructures/If.kt");
        }
        
        @TestMetadata("OnlyWhileInFunctionBody.kt")
        public void testOnlyWhileInFunctionBody() throws Exception {
            doTest("compiler/testData/cfg/controlStructures/OnlyWhileInFunctionBody.kt");
        }
        
        @TestMetadata("returnsInWhen.kt")
        public void testReturnsInWhen() throws Exception {
            doTest("compiler/testData/cfg/controlStructures/returnsInWhen.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/cfg/conventions")
    public static class Conventions extends AbstractControlFlowTest {
        public void testAllFilesPresentInConventions() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/cfg/conventions"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("equals.kt")
        public void testEquals() throws Exception {
            doTest("compiler/testData/cfg/conventions/equals.kt");
        }
        
        @TestMetadata("incrementAtTheEnd.kt")
        public void testIncrementAtTheEnd() throws Exception {
            doTest("compiler/testData/cfg/conventions/incrementAtTheEnd.kt");
        }
        
        @TestMetadata("invoke.kt")
        public void testInvoke() throws Exception {
            doTest("compiler/testData/cfg/conventions/invoke.kt");
        }
        
        @TestMetadata("notEqual.kt")
        public void testNotEqual() throws Exception {
            doTest("compiler/testData/cfg/conventions/notEqual.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/cfg/deadCode")
    public static class DeadCode extends AbstractControlFlowTest {
        public void testAllFilesPresentInDeadCode() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/cfg/deadCode"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("DeadCode.kt")
        public void testDeadCode() throws Exception {
            doTest("compiler/testData/cfg/deadCode/DeadCode.kt");
        }
        
        @TestMetadata("returnInElvis.kt")
        public void testReturnInElvis() throws Exception {
            doTest("compiler/testData/cfg/deadCode/returnInElvis.kt");
        }
        
        @TestMetadata("stringTemplate.kt")
        public void testStringTemplate() throws Exception {
            doTest("compiler/testData/cfg/deadCode/stringTemplate.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/cfg/declarations")
    @InnerTestClasses({Declarations.ClassesAndObjects.class, Declarations.FunctionLiterals.class, Declarations.Functions.class, Declarations.Local.class, Declarations.MultiDeclaration.class, Declarations.Properties.class})
    public static class Declarations extends AbstractControlFlowTest {
        public void testAllFilesPresentInDeclarations() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/cfg/declarations"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("compiler/testData/cfg/declarations/classesAndObjects")
        public static class ClassesAndObjects extends AbstractControlFlowTest {
            public void testAllFilesPresentInClassesAndObjects() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/cfg/declarations/classesAndObjects"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("AnonymousInitializers.kt")
            public void testAnonymousInitializers() throws Exception {
                doTest("compiler/testData/cfg/declarations/classesAndObjects/AnonymousInitializers.kt");
            }
            
        }
        
        @TestMetadata("compiler/testData/cfg/declarations/functionLiterals")
        public static class FunctionLiterals extends AbstractControlFlowTest {
            public void testAllFilesPresentInFunctionLiterals() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/cfg/declarations/functionLiterals"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("unusedFunctionLiteral.kt")
            public void testUnusedFunctionLiteral() throws Exception {
                doTest("compiler/testData/cfg/declarations/functionLiterals/unusedFunctionLiteral.kt");
            }
            
        }
        
        @TestMetadata("compiler/testData/cfg/declarations/functions")
        public static class Functions extends AbstractControlFlowTest {
            public void testAllFilesPresentInFunctions() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/cfg/declarations/functions"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("FailFunction.kt")
            public void testFailFunction() throws Exception {
                doTest("compiler/testData/cfg/declarations/functions/FailFunction.kt");
            }
            
            @TestMetadata("typeParameter.kt")
            public void testTypeParameter() throws Exception {
                doTest("compiler/testData/cfg/declarations/functions/typeParameter.kt");
            }
            
        }
        
        @TestMetadata("compiler/testData/cfg/declarations/local")
        public static class Local extends AbstractControlFlowTest {
            public void testAllFilesPresentInLocal() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/cfg/declarations/local"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("localClass.kt")
            public void testLocalClass() throws Exception {
                doTest("compiler/testData/cfg/declarations/local/localClass.kt");
            }
            
            @TestMetadata("LocalDeclarations.kt")
            public void testLocalDeclarations() throws Exception {
                doTest("compiler/testData/cfg/declarations/local/LocalDeclarations.kt");
            }
            
            @TestMetadata("localProperty.kt")
            public void testLocalProperty() throws Exception {
                doTest("compiler/testData/cfg/declarations/local/localProperty.kt");
            }
            
            @TestMetadata("ObjectExpression.kt")
            public void testObjectExpression() throws Exception {
                doTest("compiler/testData/cfg/declarations/local/ObjectExpression.kt");
            }
            
        }
        
        @TestMetadata("compiler/testData/cfg/declarations/multiDeclaration")
        public static class MultiDeclaration extends AbstractControlFlowTest {
            public void testAllFilesPresentInMultiDeclaration() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/cfg/declarations/multiDeclaration"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("MultiDecl.kt")
            public void testMultiDecl() throws Exception {
                doTest("compiler/testData/cfg/declarations/multiDeclaration/MultiDecl.kt");
            }
            
            @TestMetadata("multiDeclarationWithError.kt")
            public void testMultiDeclarationWithError() throws Exception {
                doTest("compiler/testData/cfg/declarations/multiDeclaration/multiDeclarationWithError.kt");
            }
            
        }
        
        @TestMetadata("compiler/testData/cfg/declarations/properties")
        public static class Properties extends AbstractControlFlowTest {
            public void testAllFilesPresentInProperties() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/cfg/declarations/properties"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("backingFieldAccess.kt")
            public void testBackingFieldAccess() throws Exception {
                doTest("compiler/testData/cfg/declarations/properties/backingFieldAccess.kt");
            }
            
            @TestMetadata("backingFieldQualifiedWithThis.kt")
            public void testBackingFieldQualifiedWithThis() throws Exception {
                doTest("compiler/testData/cfg/declarations/properties/backingFieldQualifiedWithThis.kt");
            }
            
            @TestMetadata("DelegatedProperty.kt")
            public void testDelegatedProperty() throws Exception {
                doTest("compiler/testData/cfg/declarations/properties/DelegatedProperty.kt");
            }
            
        }
        
        public static Test innerSuite() {
            TestSuite suite = new TestSuite("Declarations");
            suite.addTestSuite(Declarations.class);
            suite.addTestSuite(ClassesAndObjects.class);
            suite.addTestSuite(FunctionLiterals.class);
            suite.addTestSuite(Functions.class);
            suite.addTestSuite(Local.class);
            suite.addTestSuite(MultiDeclaration.class);
            suite.addTestSuite(Properties.class);
            return suite;
        }
    }
    
    @TestMetadata("compiler/testData/cfg/expressions")
    public static class Expressions extends AbstractControlFlowTest {
        public void testAllFilesPresentInExpressions() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/cfg/expressions"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("assignmentToThis.kt")
        public void testAssignmentToThis() throws Exception {
            doTest("compiler/testData/cfg/expressions/assignmentToThis.kt");
        }
        
        @TestMetadata("Assignments.kt")
        public void testAssignments() throws Exception {
            doTest("compiler/testData/cfg/expressions/Assignments.kt");
        }
        
        @TestMetadata("chainedQualifiedExpression.kt")
        public void testChainedQualifiedExpression() throws Exception {
            doTest("compiler/testData/cfg/expressions/chainedQualifiedExpression.kt");
        }
        
        @TestMetadata("expressionAsFunction.kt")
        public void testExpressionAsFunction() throws Exception {
            doTest("compiler/testData/cfg/expressions/expressionAsFunction.kt");
        }
        
        @TestMetadata("LazyBooleans.kt")
        public void testLazyBooleans() throws Exception {
            doTest("compiler/testData/cfg/expressions/LazyBooleans.kt");
        }
        
        @TestMetadata("nothingExpr.kt")
        public void testNothingExpr() throws Exception {
            doTest("compiler/testData/cfg/expressions/nothingExpr.kt");
        }
        
        @TestMetadata("propertySafeCall.kt")
        public void testPropertySafeCall() throws Exception {
            doTest("compiler/testData/cfg/expressions/propertySafeCall.kt");
        }
        
        @TestMetadata("qualifiedExpressionWithoutSelector.kt")
        public void testQualifiedExpressionWithoutSelector() throws Exception {
            doTest("compiler/testData/cfg/expressions/qualifiedExpressionWithoutSelector.kt");
        }
        
        @TestMetadata("ReturnFromExpression.kt")
        public void testReturnFromExpression() throws Exception {
            doTest("compiler/testData/cfg/expressions/ReturnFromExpression.kt");
        }
        
        @TestMetadata("thisExpression.kt")
        public void testThisExpression() throws Exception {
            doTest("compiler/testData/cfg/expressions/thisExpression.kt");
        }
        
        @TestMetadata("unresolvedCall.kt")
        public void testUnresolvedCall() throws Exception {
            doTest("compiler/testData/cfg/expressions/unresolvedCall.kt");
        }
        
        @TestMetadata("unresolvedProperty.kt")
        public void testUnresolvedProperty() throws Exception {
            doTest("compiler/testData/cfg/expressions/unresolvedProperty.kt");
        }
        
        @TestMetadata("unusedExpressionSimpleName.kt")
        public void testUnusedExpressionSimpleName() throws Exception {
            doTest("compiler/testData/cfg/expressions/unusedExpressionSimpleName.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/cfg/functions")
    public static class Functions extends AbstractControlFlowTest {
        public void testAllFilesPresentInFunctions() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/cfg/functions"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("DefaultValuesForArguments.kt")
        public void testDefaultValuesForArguments() throws Exception {
            doTest("compiler/testData/cfg/functions/DefaultValuesForArguments.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/cfg/tailCalls")
    public static class TailCalls extends AbstractControlFlowTest {
        public void testAllFilesPresentInTailCalls() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/cfg/tailCalls"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("finally.kt")
        public void testFinally() throws Exception {
            doTest("compiler/testData/cfg/tailCalls/finally.kt");
        }
        
        @TestMetadata("finallyWithReturn.kt")
        public void testFinallyWithReturn() throws Exception {
            doTest("compiler/testData/cfg/tailCalls/finallyWithReturn.kt");
        }
        
        @TestMetadata("sum.kt")
        public void testSum() throws Exception {
            doTest("compiler/testData/cfg/tailCalls/sum.kt");
        }
        
        @TestMetadata("try.kt")
        public void testTry() throws Exception {
            doTest("compiler/testData/cfg/tailCalls/try.kt");
        }
        
        @TestMetadata("tryCatchFinally.kt")
        public void testTryCatchFinally() throws Exception {
            doTest("compiler/testData/cfg/tailCalls/tryCatchFinally.kt");
        }
        
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("ControlFlowTestGenerated");
        suite.addTestSuite(ControlFlowTestGenerated.class);
        suite.addTestSuite(Arrays.class);
        suite.addTestSuite(Basic.class);
        suite.addTestSuite(Bugs.class);
        suite.addTestSuite(ControlStructures.class);
        suite.addTestSuite(Conventions.class);
        suite.addTestSuite(DeadCode.class);
        suite.addTest(Declarations.innerSuite());
        suite.addTestSuite(Expressions.class);
        suite.addTestSuite(Functions.class);
        suite.addTestSuite(TailCalls.class);
        return suite;
    }
}
